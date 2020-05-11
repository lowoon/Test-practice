package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public Integer fileReadTemplate(String filePath, BufferedReaderCallback callBack) throws
        IOException {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            int ret = callBack.doSomethingWithReader(br);
            return ret;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            if (br != null) {
                try { br.close(); }
                catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public Integer lineReadTemplate(String filePath, LineCallBack callBack, int initVal) throws
        IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            int res = initVal;
            String line = null;
            while ((line = br.readLine()) != null) {
                res = callBack.doSomethingWithLine(line, res);
            }
            return res;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            if (br != null) {
                try { br.close(); }
                catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    // public Integer calcSum(String filepath) throws IOException {
    //     BufferedReaderCallback sumCallBack =
    //         new BufferedReaderCallback() {
    //             @Override
    //             public Integer doSomethingWithReader(BufferedReader br) throws IOException {
    //                 int sum = 0;
    //                 String line = null;
    //                 while ((line = br.readLine()) != null) {
    //                     sum += Integer.parseInt(line);
    //                 }
    //                 return sum;
    //             }
    //         };
    //     return fileReadTemplate(filepath, sumCallBack);
    // }
    //
    // public Integer calcMultiply(String filePath) throws IOException {
    //     BufferedReaderCallback multiplyCallBack =
    //         new BufferedReaderCallback() {
    //             @Override
    //             public Integer doSomethingWithReader(BufferedReader br) throws IOException {
    //                 int multiply = 1;
    //                 String line = null;
    //                 while ((line = br.readLine()) != null) {
    //                     multiply *= Integer.parseInt(line);
    //                 }
    //                 return multiply;
    //             }
    //         };
    //     return fileReadTemplate(filePath, multiplyCallBack);
    // }

    public Integer calcSum(String filepath) throws IOException {
        LineCallBack sumCallBack =
            new LineCallBack() {
                @Override
                public Integer doSomethingWithLine(String line, Integer value) {
                    return value + Integer.parseInt(line);
                }
            };

        return lineReadTemplate(filepath, sumCallBack, 0);
    }

    public Integer calcMultiply(String filePath) throws IOException {
        LineCallBack multiplyCallBack =
            new LineCallBack() {
                @Override
                public Integer doSomethingWithLine(String line, Integer value) {
                    return value * Integer.parseInt(line);
                }
            };
        return lineReadTemplate(filePath, multiplyCallBack, 1);
    }
}
