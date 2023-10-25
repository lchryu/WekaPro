import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVSaver;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.File;
import java.io.IOException;

public class MyKnowledgeModel {
    DataSource source;
    Instances dataset;



    public MyKnowledgeModel() {
    }
    public MyKnowledgeModel(String filename) throws Exception {
        this.source = new DataSource(filename);
        this.dataset = source.getDataSet();
    }
    public void saveData(String filename) throws IOException {
        ArffSaver outData = new ArffSaver();
        outData.setInstances(this.dataset);
        outData.setFile(new File(filename));
        outData.writeBatch();
        System.out.println("Saving finished");
    }
    public void saveData2CSV(String filename) throws IOException {
        CSVSaver outData = new CSVSaver();
        outData.setFile(new File(filename));
        outData.setInstances(this.dataset);
        outData.writeBatch();
        System.out.println("Converted");
    }
    @Override
    public String toString() {
        return dataset.toSummaryString();
    }
}
