package org.jug.jbcn.controller.pushtoken;

import org.jug.jbcn.controller.RestErrors;
import org.jug.jbcn.controller.http.PushTokenRegisterRequest;
import org.jug.jbcn.controller.http.RestBasicResponse;
import org.jug.jbcn.controller.RouterConsts;
import org.jug.jbcn.jbcn.uc.PushTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jguitart on 29/3/17.
 */
@RestController
@RequestMapping(RouterConsts.API_PREFIX + RouterConsts.API_PUSH_PREFIX)
public class PushTokenController {

    @Autowired
    PushTokenService pushTokenService;


    @RequestMapping(value="", method = RequestMethod.POST)
    public RestBasicResponse registerToken(@RequestBody PushTokenRegisterRequest request) {
        if(request==null) {
            return new RestBasicResponse(false, new String[] {RestErrors.INVALID_REQUEST});
        }
        if(request.getDeviceId()==null || "".equals(request.getDeviceId())) {
            return new RestBasicResponse(false, new String[] {RestErrors.DEVICEID_MANDATORY});
        }
        if(request.getToken() == null || "".equals(request.getToken())) {
            return new RestBasicResponse(false, new String[] {RestErrors.TOKEN_MANDATORY});
        }
        pushTokenService.saveToken(request.getDeviceId(), request.getToken());
        return new RestBasicResponse(true, null);
    }

    @RequestMapping(value="/{deviceId}", method = RequestMethod.DELETE)
    public RestBasicResponse unregisterToken(@PathVariable String deviceId) {
        if(deviceId==null || "".equals(deviceId)) {
            return new RestBasicResponse(false, new String[] {RestErrors.DEVICEID_MANDATORY});
        }
        pushTokenService.unregister(deviceId);
        return new RestBasicResponse(true, null);
    }

}
