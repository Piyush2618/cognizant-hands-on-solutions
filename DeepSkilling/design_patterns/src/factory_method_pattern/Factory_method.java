package factory_method_pattern;

public class Factory_method {
    

interface Document{
    void document();
}

class WordDocument implements  Document{
    public  void document(){
        System.out.println("This is worddocument");
    }
}

class PdfDocument implements Document{
    public  void document(){
        System.out.println("This is a pdf document");
    }
}

class Exceldocument implements Document{
    public  void document(){
        System.out.println("This is a Excel document");
    }
}

class DocFactory{
    public Document getdoc(String type){
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
    Document D1 = factory.getdoc("word");
    if(D1 != null) D1.document();
    
    Document D2 = factory.getdoc("pdf");
    if(D2 != null) D2.document();
    
    Document D3 = factory.getdoc("excel");
    if(D3 != null) D3.document();
}
}

