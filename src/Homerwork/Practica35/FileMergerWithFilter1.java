package Homerwork.Practica35;

import java.io.IOException;
import java.util.List;

public interface FileMergerWithFilter1 {

    void mergeFilesExcludingKeyword(List<String> inputFilePaths, String outputFilePath, String keyword)
            throws IOException;
}
