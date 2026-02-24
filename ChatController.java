package com.agro.chatbot.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class ChatController {

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> request) {

        String message = request.get("message").toLowerCase();
        String response = "Sorry, I didn't understand.";

        if (message.contains("rice")) {
            response = "Rice needs good irrigation and nitrogen fertilizer.";
        }

        if (message.contains("weather")) {
            response = "Today's weather is Sunny, 32°C.";
        }

        if (message.contains("wheat")) {
            response = "Wheat grows well in cool climate with proper irrigation.";
        }

        Map<String, String> result = new HashMap<>();
        result.put("response", response);

        return result;
    }
}