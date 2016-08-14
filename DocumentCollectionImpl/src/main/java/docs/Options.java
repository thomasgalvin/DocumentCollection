package docs;

import java.util.List;

public class Options
{
    private List<String> files;
    private galvin.pandoc.Options pandoc;

    public List<String> getFiles() {
        return files;
    }

    public void setFiles( List<String> files ) {
        this.files = files;
    }

    public galvin.pandoc.Options getPandoc() {
        return pandoc;
    }

    public void setPandoc( galvin.pandoc.Options pandoc ) {
        this.pandoc = pandoc;
    }
    
}
