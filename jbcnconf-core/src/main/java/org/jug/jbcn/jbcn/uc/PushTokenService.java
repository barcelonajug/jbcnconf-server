package org.jug.jbcn.jbcn.uc;

import org.jug.jbcn.jbcn.model.PushTokenJPA;
import org.jug.jbcn.jbcn.model.dto.PushToken;
import org.jug.jbcn.jbcn.repository.PushTokenRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by jguitart on 25/3/17.
 */
@Service
public class PushTokenService {

    @Autowired
    private PushTokenRepositoryJPA repository;

    public void saveToken(String deviceId, String token) {

        Optional<PushTokenJPA> optionalToken = repository.findByDeviceId(deviceId);
        if(optionalToken.isPresent()) {
            repository.delete(optionalToken.get());
        }
        PushTokenJPA pushToken = new PushTokenJPA();
        pushToken.setDeviceId(deviceId);
        pushToken.setToken(token);
        repository.save(pushToken);
    }

    public PushToken getToken(String deviceId) {
        Optional<PushTokenJPA> optionalToken = repository.findByDeviceId(deviceId);
        PushToken result = null;
        if(optionalToken.isPresent()) {
            result = (PushToken) optionalToken.get();
        }
        return result;
    }




}
