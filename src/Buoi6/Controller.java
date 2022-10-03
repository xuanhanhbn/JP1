package Buoi6;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextArea txtAddress;

    public Text fullName;
    public Text email;
    public Text age;
    public Text address;

    public Text noticeFullName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;

    public void handleSubmit(){
        String fn = txtFullName.getText();
        if(fn.isEmpty()){
            noticeFullName.setText("Vui lòng nhập họ tên");
            noticeFullName.setVisible(true);
        }else {
            fullName.setText(fn);
            noticeFullName.setVisible(false);
        }
        String ag = txtAge.getText();
        try {
            Integer nAge = Integer.parseInt(ag);
            if(nAge < 0 || nAge>100)
                throw new Exception("Vui lòng nhập tuổi hợp lệ");
            age.setText(ag);
            noticeAge.setVisible(false);
        }catch (Exception e){
            noticeAge.setText(e.getMessage());
            noticeAge.setVisible(true);
        }
    }
}