package wx.wx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wx.wx.dto.WebResponseDTO;

/**
 * @author Coolerwu
 * @version 1.0
 */
@RestController
public class ProblemController {
    @GetMapping(value = "/")
    public WebResponseDTO index() {
        return new WebResponseDTO();
    }
}
