package club.piclight.navigator.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @PostMapping("/api/user/login")
    private Map<String, Object> userLogin() {
        Map<String, Object> resp = new HashMap<>();
        resp.put("code", 20000);
        resp.put("data", "TEST");
        return resp;
    }

    @GetMapping("/api/user/info")
    private Map<String, Object> getUserInfo() {
        Map<String , Object> resp = new HashMap<>();
        resp.put("code", 20000);
        resp.put("roles", "admin");
        resp.put("introduction", "Admin");
        Map<String , Object> data = new HashMap<>();
        data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        data.put("name", "12321321");
        resp.put("data", data);
        return resp;
    }
}
