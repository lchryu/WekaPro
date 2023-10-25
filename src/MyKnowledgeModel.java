import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class MyKnowledgeModel {
    DataSource source;
    Instances dataset;



    public MyKnowledgeModel() {
    }
    public MyKnowledgeModel(String filename) throws Exception {
        this.source = new DataSource(filename);
        this.dataset = source.getDataSet();
    }

    @Override
    public String toString() {
        return dataset.toSummaryString();
    }
}
