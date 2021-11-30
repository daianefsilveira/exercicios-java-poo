package classedata;

public class TestarData {

    public static void main(String[] args) {

        Data data = new Data();

        data.dia = 3;
        data.mes = 9;
        data.ano = 2021;
        data.escreverAData();
        data.escreverOMes();
        data.mes = 12;
        data.escreverAData();
        data.escreverOMes();
    }
}
