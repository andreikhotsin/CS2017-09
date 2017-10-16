package by.it.sc03_evening_mon_fri.khotsin.lesson06;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class Testing {

    @Test
    public void testTaskA1() throws Exception {
        run("").include(
                "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ \n" +
                        "$ $ $ $ $ $ $ $ $ $ ");
    }

    @Test
    public void testTaskA2() throws Exception {
        run("2 3").is("$$$\n$$$\n").exclude("\n\n").include("$$$");
        run("4 8").is(
                "$$$$$$$$\n" +
                        "$$$$$$$$\n" +
                        "$$$$$$$$\n" +
                        "$$$$$$$$\n");
        run("1 1").is("$\n").include("$").exclude("\n\n\n");
    }

    @Test
    public void testTaskA3() throws Exception {
        run("10").is("A\n" +
                "AB\n" +
                "ABC\n" +
                "ABCD\n" +
                "ABCDE\n" +
                "ABCDEF\n" +
                "ABCDEFG\n" +
                "ABCDEFGH\n" +
                "ABCDEFGHI\n" +
                "ABCDEFGHIJ\n");
        run("2").is("A\n" +
                "AB\n");
        run("1").is("A\n");
    }

    @Test
    public void testTaskB1() throws Exception {
        run("-2 2 1 -1").include("0");
        run("1 2 3 4 56 45 234 23 423 4 234 2 34 23 4 234 34 23 423 -1").include("1805");
        run("0 0 0 0 -1").include("-1");
        run("-1").include("-1");
    }


    @Test
    public void testTaskB2() throws Exception {
        run("1\n2\n3\n4\n5\n").include("Minimum = 1");
        run("2\n2\n2\n2\n5\n").include("Minimum = 2");
        run("1\n2\n3\n4\n0\n").include("Minimum = 0");
        run("1\n2\n-3\n4\n0\n").include("Minimum = -3");
        run("1\n2\n3\n-4\n0\n").include("Minimum = -4");
    }

    @Test
    public void testTaskB3() throws Exception {
        run("10\n9\n8\n7\n6\n5\n4\n3\n2\n1\n0\n")
                .include("Minimum = 0\n")
                .include("Maximum = 9\n")
                .include("Average = 4.5");
        run("1\n1\n")
                .include("Minimum = 1\n")
                .include("Maximum = 1\n")
                .include("Average = 1.0");
        run("7\n1\n6\n3\n2\n-9\n2\n-9\n")
                .include("Minimum = -9\n")
                .include("Maximum = 6\n")
                .include("Average = -0.571428571428");
    }


    @Test
    public void testTaskC1() throws Exception {
        run("0").is("1 = 1\n");
        run("6").is("0000001 = 1\n" +
                "0000010 = 2\n" +
                "0000100 = 4\n" +
                "0001000 = 8\n" +
                "0010000 = 16\n" +
                "0100000 = 32\n" +
                "1000000 = 64\n");
        run("16").is("00000000000000001 = 1\n" +
                "00000000000000010 = 2\n" +
                "00000000000000100 = 4\n" +
                "00000000000001000 = 8\n" +
                "00000000000010000 = 16\n" +
                "00000000000100000 = 32\n" +
                "00000000001000000 = 64\n" +
                "00000000010000000 = 128\n" +
                "00000000100000000 = 256\n" +
                "00000001000000000 = 512\n" +
                "00000010000000000 = 1024\n" +
                "00000100000000000 = 2048\n" +
                "00001000000000000 = 4096\n" +
                "00010000000000000 = 8192\n" +
                "00100000000000000 = 16384\n" +
                "01000000000000000 = 32768\n" +
                "10000000000000000 = 65536\n");
        run("60").include("0000000000000000000000000000000000000000000000000000000000001 = 1\n" +
                "0000000000000000000000000000000000000000000000000000000000010 = 2\n" +
                "0000000000000000000000000000000000000000000000000000000000100 = 4\n" +
                "0000000000000000000000000000000000000000000000000000000001000 = 8\n" +
                "0000000000000000000000000000000000000000000000000000000010000 = 16\n" +
                "0000000000000000000000000000000000000000000000000000000100000 = 32\n" +
                "0000000000000000000000000000000000000000000000000000001000000 = 64\n" +
                "0000000000000000000000000000000000000000000000000000010000000 = 128\n" +
                "0000000000000000000000000000000000000000000000000000100000000 = 256\n" +
                "0000000000000000000000000000000000000000000000000001000000000 = 512\n" +
                "0000000000000000000000000000000000000000000000000010000000000 = 1024\n" +
                "0000000000000000000000000000000000000000000000000100000000000 = 2048\n" +
                "0000000000000000000000000000000000000000000000001000000000000 = 4096\n" +
                "0000000000000000000000000000000000000000000000010000000000000 = 8192\n" +
                "0000000000000000000000000000000000000000000000100000000000000 = 16384\n" +
                "0000000000000000000000000000000000000000000001000000000000000 = 32768\n" +
                "0000000000000000000000000000000000000000000010000000000000000 = 65536\n" +
                "0000000000000000000000000000000000000000000100000000000000000 = 131072\n" +
                "0000000000000000000000000000000000000000001000000000000000000 = 262144\n" +
                "0000000000000000000000000000000000000000010000000000000000000 = 524288\n" +
                "0000000000000000000000000000000000000000100000000000000000000 = 1048576\n" +
                "0000000000000000000000000000000000000001000000000000000000000 = 2097152\n" +
                "0000000000000000000000000000000000000010000000000000000000000 = 4194304\n" +
                "0000000000000000000000000000000000000100000000000000000000000 = 8388608\n" +
                "0000000000000000000000000000000000001000000000000000000000000 = 16777216\n" +
                "0000000000000000000000000000000000010000000000000000000000000 = 33554432\n" +
                "0000000000000000000000000000000000100000000000000000000000000 = 67108864\n" +
                "0000000000000000000000000000000001000000000000000000000000000 = 134217728\n" +
                "0000000000000000000000000000000010000000000000000000000000000 = 268435456\n" +
                "0000000000000000000000000000000100000000000000000000000000000 = 536870912\n" +
                "0000000000000000000000000000001000000000000000000000000000000 = 1073741824\n" +
                "0000000000000000000000000000010000000000000000000000000000000 = 2147483648\n" +
                "0000000000000000000000000000100000000000000000000000000000000 = 4294967296\n" +
                "0000000000000000000000000001000000000000000000000000000000000 = 8589934592\n" +
                "0000000000000000000000000010000000000000000000000000000000000 = 17179869184\n" +
                "0000000000000000000000000100000000000000000000000000000000000 = 34359738368\n" +
                "0000000000000000000000001000000000000000000000000000000000000 = 68719476736\n" +
                "0000000000000000000000010000000000000000000000000000000000000 = 137438953472\n" +
                "0000000000000000000000100000000000000000000000000000000000000 = 274877906944\n" +
                "0000000000000000000001000000000000000000000000000000000000000 = 549755813888\n" +
                "0000000000000000000010000000000000000000000000000000000000000 = 1099511627776\n" +
                "0000000000000000000100000000000000000000000000000000000000000 = 2199023255552\n" +
                "0000000000000000001000000000000000000000000000000000000000000 = 4398046511104\n" +
                "0000000000000000010000000000000000000000000000000000000000000 = 8796093022208\n" +
                "0000000000000000100000000000000000000000000000000000000000000 = 17592186044416\n" +
                "0000000000000001000000000000000000000000000000000000000000000 = 35184372088832\n" +
                "0000000000000010000000000000000000000000000000000000000000000 = 70368744177664\n" +
                "0000000000000100000000000000000000000000000000000000000000000 = 140737488355328\n" +
                "0000000000001000000000000000000000000000000000000000000000000 = 281474976710656\n" +
                "0000000000010000000000000000000000000000000000000000000000000 = 562949953421312\n" +
                "0000000000100000000000000000000000000000000000000000000000000 = 1125899906842624\n" +
                "0000000001000000000000000000000000000000000000000000000000000 = 2251799813685248\n" +
                "0000000010000000000000000000000000000000000000000000000000000 = 4503599627370496\n" +
                "0000000100000000000000000000000000000000000000000000000000000 = 9007199254740992\n" +
                "0000001000000000000000000000000000000000000000000000000000000 = 18014398509481984\n" +
                "0000010000000000000000000000000000000000000000000000000000000 = 36028797018963968\n" +
                "0000100000000000000000000000000000000000000000000000000000000 = 72057594037927936\n" +
                "0001000000000000000000000000000000000000000000000000000000000 = 144115188075855872\n" +
                "0010000000000000000000000000000000000000000000000000000000000 = 288230376151711744\n" +
                "0100000000000000000000000000000000000000000000000000000000000 = 576460752303423488\n" +
                "1000000000000000000000000000000000000000000000000000000000000 = 1152921504606846976\n");

    }

    @Test
    public void testTaskC2() throws Exception {
        boolean ok=run("").stringWriter.toString().replaceAll(" ","").replaceAll("\n","").hashCode()==626587336;
        assertTrue("Решение пока не найдено ;)",ok);
    }

    @Test
    public void testTaskC3() throws Exception {
        run("4611686018427387904").is("YES\n");
        run("4611680010027387902").is("NO\n");
        run("1152921504606846976").is("YES\n");
        run("1152921508764567976").is("NO\n");
        run("4294967296").is("YES\n");
        run("4225742356").is("NO\n");
        run("65536").is("YES\n");
        run("65567").is("NO\n");
        run("1024").is("YES\n");
        run("2222").is("NO\n");
        run("2").is("YES\n");
        run("3").is("NO\n");
        run("1").is("YES\n");
    }


    /*
    ===========================================================================================================
    НИЖЕ ВСПОМОГАТЕЛЬНЫЙ КОД ТЕСТОВ. НЕ МЕНЯЙТЕ В ЭТОМ ФАЙЛЕ НИЧЕГО.
    Но изучить как он работает - можно, это всегда будет полезно.
    ===========================================================================================================
     */
    //метод находит и создает класс для тестирования
    //по имени вызывающего его метода, testTaskA1 будет работать с TaskA1
    private static Testing run(String in) {
        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();
        StackTraceElement element;
        int i = 0;
        do {
            element = trace[i++];
        }
        while (!element.getMethodName().contains("test"));

        String[] path = element.getClassName().split("\\.");
        String nameTestMethod = element.getMethodName();
        String clName = nameTestMethod.replace("test", "");
        clName = element.getClassName().replace(path[path.length - 1], clName);
        System.out.println("\n---------------------------------------------");
        System.out.println("Старт теста для " + clName + "\ninput:" + in);
        System.out.println("---------------------------------------------");
        return new Testing(clName, in);
    }

    public Testing() {
        //Конструктор тестов
    }

    //Конструктор тестов
    //    private Testing(String className) {
    //        this(className, "");
    //    }

    //Основной конструктор тестов
    private Testing(String className, String in) {
        //this.className = className;
        Class<?> c = null;
        try {
            c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            fail("Не найден класс " + className);
        }
        reader = new StringReader(in); //заполнение ввода
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return reader.read();
            }
        };
        System.setIn(inputStream);   //перехват ввода

        System.setOut(newOut); //перехват стандартного вывода
        try {
            Class[] argTypes = new Class[]{String[].class};
            Method main = c.getDeclaredMethod("main", argTypes);
            main.invoke(null, (Object) new String[]{});

        } catch (Exception x) {
            x.printStackTrace();
        }
        System.setOut(oldOut); //возврат вывода
    }

    //проверка вывода
    private Testing is(String str) {
        assertTrue("Ожидается такой вывод:\n<---начало---->\n" + str + "<---конец--->",
                stringWriter.toString().equals(str));
        return this;
    }

    private Testing include(String str) {
        assertTrue("Строка не найдена: " + str + "\n", stringWriter.toString().contains(str));
        return this;
    }

    private Testing exclude(String str) {
        assertTrue("Лишние данные в выводе: " + str + "\n", !stringWriter.toString().contains(str));
        return this;
    }


    //переменные теста
    private StringWriter stringWriter = new StringWriter();
    private PrintStream oldOut = System.out;
    private StringReader reader;


    //поле для перехвата потока вывода
    private PrintStream newOut;

    {
        newOut = new PrintStream(new OutputStream() {
            private byte bytes[] = new byte[2];

            @Override
            public void write(int b) throws IOException {
                if (b < 0) { //ловим и собираем двухбайтовый UTF (первый код > 127, или в байте <0)
                    if (bytes[0] == 0) { //если это первый байт
                        bytes[0] = (byte) b; //то запомним его
                    } else {
                        bytes[1] = (byte) b; //иначе это второй байт
                        String s = new String(bytes); //соберем весь символ
                        stringWriter.append(s); //запомним вывод для теста
                        oldOut.append(s); //копию в обычный вывод
                        bytes[0] = 0; //забудем все.
                    }
                } else {
                    char c = (char) b; //ловим и собираем однобайтовый UTF
                    bytes[0] = 0;
                    if (c != '\r') {
                        stringWriter.write(c); //запомним вывод для теста
                    }
                    oldOut.write(c); //копию в обычный вывод
                }
            }
        });
    }

}
