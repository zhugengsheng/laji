package wx.wx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RubbishKind {
    private int id;
    private int rubbishkind;
    private String rubbish;
    private int rubbishId;
}
