package factory_method_pattern;

public class Factory_method {
    

interface Doc{
    void doc();
}

class WordDocument implements  Doc{
    public  void doc(){
        System.out.println("word document");
    }
}

class PdfDocument implements Doc{
    public  void doc(){
        System.out.println("pdf document");
    }
}

class Exceldocument implements Doc{
    public  void doc(){
        System.out.println("Excel document");
    }
}

class DocFactory{
    public Doc getdoc(String type){
        if(type.equals("word")){
            return new WordDocument();
        }else if(type.equals("pdf")){
            return new PdfDocument();
        } else if(type.equals("excel")) {
            return new Exceldocument();
        }
        return null;
    }
}
public void run(){
    DocFactory factory = new DocFactory();
    Doc D1 = factory.getdoc("word");
    if(D1 != null) D1.doc();
    
    Doc D2 = factory.getdoc("pdf");
    if(D2 != null) D2.doc();
    
    Doc D3 = factory.getdoc("excel");
    if(D3 != null) D3.doc();
}
}

