package easyexcel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import easyexcel.domain.ExcelData;
import easyexcel.listener.ExcelListener;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Description:
 * Author: wei
 * Date：2019/6/18
 */
public class EasypoiTest {


    @Test
    public void testExcel2003NoModel() throws FileNotFoundException {
        String path = "D:\\conf\\changeInviter\\changeData.xlsx";

        InputStream inputStream = new FileInputStream(path);
        try {
            // 解析每行结果在listener中处理
            AnalysisEventListener listener = new ExcelListener();

            ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, listener);
            excelReader.read(new Sheet(1, 1, ExcelData.class));

            System.out.println(123);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
