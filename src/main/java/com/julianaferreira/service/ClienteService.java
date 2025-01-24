package com.julianaferreira.service;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final OutroService outroService;

    
    public ClienteService(OutroService outroService) {
        this.outroService = outroService;
    }

    public void executeSomeLogic() {
        outroService.performAction();
    }
}
