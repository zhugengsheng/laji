package wx.wx.dto.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import wx.wx.dto.UserInfoDTO;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResult {
    private int code;
    private String message;
    private UserInfoDTO data;
}
