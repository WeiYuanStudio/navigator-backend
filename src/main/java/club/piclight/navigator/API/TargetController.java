package club.piclight.navigator.API;

import club.piclight.navigator.Model.Target;
import club.piclight.navigator.Repository.TargetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@RestController
public class TargetController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TargetController.class);

    @Autowired
    TargetRepository targetRepository;

    /**
     * 获取所有target
     * @return
     */
    @GetMapping("/api/target")
    private List<Target> getTargetList() {
        return targetRepository.findAll();
    }

    /**
     * 插入target
     * @param target
     * @return
     */
    @PostMapping("/api/target")
    private Map<String, Object> addTarget(@RequestBody club.piclight.navigator.API.ViewModel.Target target) {
        LOGGER.info("Receive request add target " + target.getName());
        Target saved = targetRepository.save(new Target(target));

        Hashtable<String , Object> resp = new Hashtable<>();
        resp.put("message", "Success");
        resp.put("target", saved);
        return resp;
    }

    /**
     * 删除target
     * @param id
     * @return
     */
    @DeleteMapping("/api/target")
    private Map<String, Object> deleteTarget(@RequestParam Long id) {
        LOGGER.info("Receive request delete target id" + id);
        Hashtable<String, Object> resp = new Hashtable<>();

        try {
            targetRepository.deleteById(id);
            resp.put("message", "Success delete target");
            resp.put("deletedId", id);
        } catch (EmptyResultDataAccessException e) {
            resp.put("message", "Failed to delete target");
            return resp;
        }
        return resp;
    }
}
