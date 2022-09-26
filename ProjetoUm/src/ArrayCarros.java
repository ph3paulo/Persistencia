import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ListaDeCarros")

public class ArrayCarros {
    private List<Carro>listaCarros;

    public ArrayCarros(){
    }

    public ArrayCarros(List<Carro>listaCarros){
        this.listaCarros = listaCarros;
    }
    @JacksonXmlElementWrapper(localName = "carros")
    @JacksonXmlProperty(localName = "carro")

    public List<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(List<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    @Override
    public String toString() {
        return this.listaCarros.toString();
    }
    
}
