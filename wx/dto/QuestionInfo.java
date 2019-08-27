package wx.wx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QuestionInfo {
    //垃圾所属
    private int rubbishKind;
    //问题所属类别
    private String questionKind;
    //该类别问题第几个
    private int questionNum;

    //问题简介
    private String questionInfo;
    //问题内容
    private String question;
    //问题答案选项
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;

    //正确答案选项
    private String right;

}
