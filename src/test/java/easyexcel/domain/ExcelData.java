package easyexcel.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * Description:
 * Author: wei
 * Date：2019/6/19
 */

public class ExcelData extends BaseRowModel {

    @ExcelProperty(index = 0)
    private String phone;

    @ExcelProperty(index = 1)
    private String nikeName;

    @ExcelProperty(index = 2)
    private String oldInviterPhone;

    @ExcelProperty(index = 3)
    private String oldInviterNikeName;

    @ExcelProperty(index = 4)
    private String newInviterPhone;

    @ExcelProperty(index = 5)
    private String newInviterNikeName;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getOldInviterPhone() {
        return oldInviterPhone;
    }

    public void setOldInviterPhone(String oldInviterPhone) {
        this.oldInviterPhone = oldInviterPhone;
    }

    public String getOldInviterNikeName() {
        return oldInviterNikeName;
    }

    public void setOldInviterNikeName(String oldInviterNikeName) {
        this.oldInviterNikeName = oldInviterNikeName;
    }

    public String getNewInviterPhone() {
        return newInviterPhone;
    }

    public void setNewInviterPhone(String newInviterPhone) {
        this.newInviterPhone = newInviterPhone;
    }

    public String getNewInviterNikeName() {
        return newInviterNikeName;
    }

    public void setNewInviterNikeName(String newInviterNikeName) {
        this.newInviterNikeName = newInviterNikeName;
    }

    @Override
    public String toString() {
        return "ExcelData{" +
                "phone='" + phone + '\'' +
                ", nikeName='" + nikeName + '\'' +
                ", oldInviterPhone='" + oldInviterPhone + '\'' +
                ", oldInviterNikeName='" + oldInviterNikeName + '\'' +
                ", newInviterPhone='" + newInviterPhone + '\'' +
                ", newInviterNikeName='" + newInviterNikeName + '\'' +
                '}';
    }
}
