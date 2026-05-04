package swrpg.logic;

import swrpg.model.Nave;

import java.util.Iterator;
import java.util.List;

public class FlotaLogic {
    public void aplicarLluviaMeteoritos(List<Nave> naves) {
        Iterator<Nave> iterator = naves.iterator();

        while(iterator.hasNext()) {
            Nave nave = iterator.next();

            nave.setIntegridadCasco(nave.getIntegridadCasco()-40);

            if(nave.getIntegridadCasco() <= 0) {
                System.out.println("Nave "+nave.getNombre()+" eliminada");
                iterator.remove();
            }
        }
    }
}
