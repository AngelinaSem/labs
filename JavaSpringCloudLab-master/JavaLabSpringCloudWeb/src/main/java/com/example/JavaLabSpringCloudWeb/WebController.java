package com.example.JavaLabSpringCloudWeb;

import com.example.JavaLabSpringCloudWeb.model.MeD;
import com.example.JavaLabSpringCloudWeb.service.MedService;
import com.example.JavaLabSpringCloudWeb.source.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class WebController {

    public Integer user_id = null;

    @Autowired
    public MedService medService;

    @Autowired
    public Sender sender;

    @GetMapping("/course/{id}")
    public ResponseEntity<String> getCourse(@PathVariable int id) {
        return new ResponseEntity<String>(MedService.getMed(id).toString(),null,HttpStatus.OK);
    }

    @GetMapping("/MeD")
    public ResponseEntity<String> getAllCourses() {
        List<MeD> courses = MedService.getAllMeDs();
        StringBuilder stringBuilder = new StringBuilder();
        for (MeD med : MeDs){
            stringBuilder.append(MeD.briefDescription());
        }
        return new ResponseEntity<>(stringBuilder.toString(), HttpStatus.OK);
    }

    @PostMapping("/MeD/{id}/subscribe")
    public ResponseEntity<String> subscribe(@PathVariable int id) {
        if (user_id == null) return new ResponseEntity<>("You're not signed in!", HttpStatus.OK);
        if (courseService.getMeD(id) == null) return new ResponseEntity<>("No such MeD", HttpStatus.OK);
        sender.ask_to_sub(user_id, id);
        return new ResponseEntity<>("Sent subscription request", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam("user_id") int user_id, @RequestParam("code") int code){
        String result = "";
        if (sender.login(user_id,code)) {
            result = "Success";
            this.user_id = user_id;
        } else {
            result = "Wrong code";
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/subscriptions")
    public ResponseEntity<String> courseSubscriptions(){
        if (user_id == null) return new ResponseEntity<>("You're not signed in!", HttpStatus.OK);
        List<Integer> subscriptions = sender.get_subscriptions(user_id);
        List<MeD> MeDs =  MedService.getMeds(subscriptions);
        StringBuilder stringBuilder = new StringBuilder();
        for (MeD med : MeDs) {
            stringBuilder.append(MeD.briefDescription());
        }
        return new ResponseEntity<>(stringBuilder.toString(), HttpStatus.OK);
    }
}
