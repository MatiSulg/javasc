import java.util.ArrayList;
import java.util.List;

public class main {

    public void Kujud (List<Kuju> kujud){
        float koguPindala = 0;
        float koguUmbermoot = 0;
        List<String> varviLoetelu = new ArrayList<String>();

        for (Kuju kuju: kujud){
            koguPindala += kuju.pindala();
            koguUmbermoot += kuju.umbermoot();
            varviLoetelu.add(ColorUtil.varv(kuju.getVarv()));
        }

        return koguPindala, koguUmbermoot, varviLoetelu;
    }

}
