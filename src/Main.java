public class Main {
    public static void main(String[] args) throws Exception {
        MyKnowledgeModel model = new MyKnowledgeModel("D:\\Programs\\Weka-3-9-6\\data\\iris.arff");
        System.out.println(model.toString());

        model.saveData("D:\\data_weka\\iris.arff");
        model.saveData2CSV("D:\\data_weka\\iris.csv");
    }
}