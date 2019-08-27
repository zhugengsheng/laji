package wx.wx.dto.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import wx.wx.dto.RubbishKind;
import wx.wx.dto.UserInfoDTO;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RubbishKindResult {
    private int code;
    private String message;
    private List<RubbishKind> data;
}
