package com.structural.proxy;

public class DataBaseExecuterProxy implements DataBaseExecuter {

	boolean ifAdmin;
	DataBaseExecuterImpl executerImpl;



	public DataBaseExecuterProxy(String user, String password) {
		if(user.equals("admin") && password.equals("1234")) {
			ifAdmin=true;
			executerImpl = new DataBaseExecuterImpl();
		}
	}



	@Override
	public void executeDataBase(String query) throws Exception {

		if(ifAdmin) {
			executerImpl.executeDataBase(query);
		}else if(query.equals("DELETE")) {
			throw new InvalidExecute("Only Admin can execute \""+ query+"\" Query.");
		}else {
			executerImpl.executeDataBase(query);
		}

		ifAdmin=false;
	}

}
