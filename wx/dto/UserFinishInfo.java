package wx.wx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserFinishInfo {
    //用户id
    private String userId;
    //完成类别（干、湿、等）
    private String finishKind;
    //完成内容（干垃圾内的类别完成情况）
    private String finishInfo;
}
