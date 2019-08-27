package wx.wx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO {
    private int id;
    //用户ID
    private String userId;

    //用户进度
    private int finishOne;

    private int finishTwo;

    private int finishThree;

    private int finishFour;

    private int score;

    public UserInfoDTO(String userId, int finishOne, int finishTwo, int finishThree, int finishFour, int score) {
        this.userId = userId;
        this.finishOne = finishOne;
        this.finishTwo = finishTwo;
        this.finishThree = finishThree;
        this.finishFour = finishFour;
        this.score = score;
    }
}
