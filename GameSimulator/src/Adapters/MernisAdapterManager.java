package Adapters;

import java.rmi.RemoteException;
import Abstracts.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterManager implements GamerCheckService{

	@Override
	public boolean CheckIfPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalityId(),gamer.getFirstName(),gamer.getLastName(),gamer.getGetDateOfBirth());
		}
		catch (RemoteException e ) {
			e.printStackTrace();
		}
		return false;
	}
}
