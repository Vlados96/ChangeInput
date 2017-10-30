package ChangeInput;

import org.apache.camel.main.Main;
import java.io.*;
/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        File Input = new File("C:\\Users\\Антон\\Desktop\\воробей\\лаба №2\\прога\\input1.txt");
        FileReader AntonReader = new FileReader(Input);
        BufferedReader br = new BufferedReader(AntonReader);
        StringBuffer st = new StringBuffer();
        String eachLine = br.readLine();
        String[] Ar= new String[94];
        String[][] Arf= new String[94][14];
        int i=1;
        while (eachLine != null) {
            st.append(eachLine);
            st.append("\n");
            Ar[i]=st.toString();
            String m=Ar[i];
            char[] CharArray =m.toCharArray();
            if (i<10) {
                st.setLength(0);//1
                st.append(CharArray[0]);
                Arf[i][1] = st.toString();
                st.setLength(0);//2
                st.append(CharArray[2]);
                st.append(CharArray[3]);
                st.append(CharArray[4]);
                st.append(CharArray[5]);
                Arf[i][2] = st.toString();
                st.setLength(0);//3
                st.append(CharArray[7]);
                st.append(CharArray[8]);
                st.append(CharArray[9]);
                st.append(CharArray[10]);
                Arf[i][3] = st.toString();
                st.setLength(0);//4
                st.append(CharArray[12]);
                st.append(CharArray[13]);
                st.append(CharArray[14]);
                Arf[i][4] = st.toString();
                st.setLength(0);//5
                st.append(CharArray[16]);
                st.append(CharArray[17]);
                st.append(CharArray[18]);
                st.append(CharArray[19]);
                Arf[i][5] = st.toString();
                st.setLength(0);//6
                st.append(CharArray[21]);
                st.append(CharArray[22]);
                st.append(CharArray[23]);
                Arf[i][6] = st.toString();
                st.setLength(0);//7
                st.append(CharArray[25]);
                st.append(CharArray[26]);
                st.append(CharArray[27]);
                st.append(CharArray[28]);
                Arf[i][7] = st.toString();
                st.setLength(0);//8
                st.append(CharArray[30]);
                st.append(CharArray[31]);
                st.append(CharArray[32]);
                Arf[i][8] = st.toString();
                st.setLength(0);//9
                st.append(CharArray[34]);
                st.append(CharArray[35]);
                st.append(CharArray[36]);
                st.append(CharArray[37]);
                Arf[i][9] = st.toString();
                st.setLength(0);//10
                st.append(CharArray[39]);
                st.append(CharArray[40]);
                st.append(CharArray[41]);
                Arf[i][10] = st.toString();
                st.setLength(0);//11
                st.append(CharArray[43]);
                st.append(CharArray[44]);
                st.append(CharArray[45]);
                st.append(CharArray[46]);
                Arf[i][11] = st.toString();
                st.setLength(0);//12
                st.append(CharArray[48]);
                st.append(CharArray[49]);
                st.append(CharArray[50]);
                Arf[i][12] = st.toString();
                st.setLength(0);//13
                st.append(CharArray[52]);
                st.append(CharArray[53]);
                st.append(CharArray[54]);
                st.append(CharArray[55]);
                st.append(CharArray[56]);
                st.append(CharArray[57]);
                Arf[i][13] = st.toString();
            }else {
                st.setLength(0);//1
                st.append(CharArray[0]);st.append(CharArray[1]);
                Arf[i][1] = st.toString();
                st.setLength(0);//2
                st.append(CharArray[3]);
                st.append(CharArray[4]);
                st.append(CharArray[5]);
                st.append(CharArray[6]);
                Arf[i][2] = st.toString();
                st.setLength(0);//3
                st.append(CharArray[8]);
                st.append(CharArray[9]);
                st.append(CharArray[10]);
                st.append(CharArray[11]);
                Arf[i][3] = st.toString();
                st.setLength(0);//4
                st.append(CharArray[13]);
                st.append(CharArray[14]);
                st.append(CharArray[15]);
                Arf[i][4] = st.toString();
                st.setLength(0);//5
                st.append(CharArray[17]);
                st.append(CharArray[18]);
                st.append(CharArray[19]);
                st.append(CharArray[20]);
                Arf[i][5] = st.toString();
                st.setLength(0);//6
                st.append(CharArray[22]);
                st.append(CharArray[23]);
                st.append(CharArray[24]);
                Arf[i][6] = st.toString();
                st.setLength(0);//7
                st.append(CharArray[26]);
                st.append(CharArray[27]);
                st.append(CharArray[28]);
                st.append(CharArray[29]);
                Arf[i][7] = st.toString();
                st.setLength(0);//8
                st.append(CharArray[31]);
                st.append(CharArray[32]);
                st.append(CharArray[33]);
                Arf[i][8] = st.toString();
                st.setLength(0);//9
                st.append(CharArray[35]);
                st.append(CharArray[36]);
                st.append(CharArray[37]);
                st.append(CharArray[38]);
                Arf[i][9] = st.toString();
                st.setLength(0);//10
                st.append(CharArray[40]);
                st.append(CharArray[41]);
                st.append(CharArray[42]);
                Arf[i][10] = st.toString();
                st.setLength(0);//11
                st.append(CharArray[44]);
                st.append(CharArray[45]);
                st.append(CharArray[46]);
                st.append(CharArray[47]);
                Arf[i][11] = st.toString();
                st.setLength(0);//12
                st.append(CharArray[49]);
                st.append(CharArray[50]);
                st.append(CharArray[51]);
                Arf[i][12] = st.toString();
                st.setLength(0);//13
                st.append(CharArray[53]);
                st.append(CharArray[54]);
                st.append(CharArray[55]);
                st.append(CharArray[56]);
                st.append(CharArray[57]);
                st.append(CharArray[58]);
                Arf[i][13] = st.toString();

            }



            st.setLength(0);
            eachLine = br.readLine();
            i++;
        }
        Input= null;
        AntonReader = null;
        br=null;
        st=null;
        System.out.println(Ar[17]);

            /////конец первой части программы ( получил массив входных данных Arf[94][14])



        String[][] Outputfile = new String[8234][94];
        for (int S=1;S<94;S++) {
            Input = new File("C:\\Users\\Антон\\Desktop\\воробей\\лаба №2\\прога\\"+"vver.i");
            AntonReader = new FileReader(Input);
            br = new BufferedReader(AntonReader);
            st = new StringBuffer();
            String eachLin = br.readLine();
            i=S;
            String[] Outp = new String[14];
            Outp[1]="5010102"+"   "+Arf[i][2]+"        "+Arf[i][3];
            Outp[2]="4700200"+"   "+Arf[i][5]+"e+6"+"   "+Arf[i][4]+".      0.0";
            Outp[3]="4710200"+"   "+Arf[i][7]+"e+6"+"   "+Arf[i][6]+".      0.0";
            Outp[4]="4800200"+"   "+Arf[i][9]+"e+6"+"   "+Arf[i][8]+".      0.0";
            Outp[5]="4810200"+"   "+Arf[i][11]+"e+6"+"   "+Arf[i][10]+".      0.0";
            Outp[6]="4600201"+"   0.0       "+Arf[i][12]+".0     0.000";
            Outp[7]="9620301"+"   743       745       "+Arf[i][13]+"    0.";
            int g = 1;
            int k = 1;
            String T;
            while (eachLin != null) {
                st.append(eachLin);
                String U = st.toString();
                if (U.length() > 7) {
                    T = U.substring(0, 7);
                } else {
                    T = "412374918237498123749871324897123894789231489";
                }

                if (T.equals("5010102")) {
                    st.setLength(0);
                    st.append(Outp[1]);
                    k = g;
                }
                if (T.equals("4700200")) {
                    st.setLength(0);
                    st.append(Outp[2]);

                }
                if (T.equals("4710200")) {
                    st.setLength(0);
                    st.append(Outp[3]);

                }
                if (T.equals("4800200")) {
                    st.setLength(0);
                    st.append(Outp[4]);

                }
                if (T.equals("4810200")) {
                    st.setLength(0);
                    st.append(Outp[5]);

                }
                if (T.equals("4600201")) {
                    st.setLength(0);
                    st.append(Outp[6]);

                }
                if (T.equals("9620301")) {
                    st.setLength(0);
                    st.append(Outp[7]);

                }
                Outputfile[g][S] = st.toString();
                st.setLength(0);
                eachLin = br.readLine();
                g++;
            }
            Input= null;
            AntonReader = null;
            br=null;
            st=null;
        }

        // Сгенерирован массив Outputfile[8234][93], который необходимо записать в файд
        for(int k=1;k<24; k++){
            for (  i=0;i<4;i++){
                File dir = new File("C:\\Users\\Антон\\Desktop\\воробей\\лаба №2\\прога\\output\\"+k+"комп\\");
                dir.mkdir();
                dir=null;
                dir = new File("C:\\Users\\Антон\\Desktop\\воробей\\лаба №2\\прога\\output\\"+k+"комп\\"+i+"\\");
                dir.mkdir();
                dir=null;
                File In = new File("C:\\Users\\Антон\\Desktop\\воробей\\лаба №2\\прога\\"+"vver.i");
                File out = new File("C:\\Users\\Антон\\Desktop\\воробей\\лаба №2\\прога\\output\\"+k+"комп\\"+i+"\\" + "vver.i");

                out.createNewFile();
                FileInputStream Inpu = new FileInputStream(In);
                FileOutputStream Output = new FileOutputStream(out);
                try{
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = Inpu.read(buffer)) > 0) {
                        Output.write(buffer, 0, length);
                    }
                } finally {
                    In=null;
                    out=null;
                    Inpu.close();
                    Output.close();
                }
            }
        }
        // создание исходных файлов
        System.out.println(Outputfile[765][93]);
        int J=1;
        for(int k=1;k<24; k++){
            for (i=0;i<4;i++){
                File out = new File("C:\\Users\\Антон\\Desktop\\воробей\\лаба №2\\прога\\output\\"+k+"комп\\"+i+"\\" + "vver.i");
                FileWriter Anton1 = new FileWriter(out);
                for (int p=1;p<8234;p++){
                Anton1.write(Outputfile[p][J]+"\n");

                }
                J++;
                Anton1.close();



            }
        }

    }

}

