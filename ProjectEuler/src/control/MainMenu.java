package control;

import java.lang.reflect.Method;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MainMenu {
	private ArrayList<JPanel> view;

	public MainMenu(){
		view = new ArrayList<JPanel>();
		populate();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void populate(){
		boolean continua = true;
		int numClasse = 1;
		Class classe;
		Method getPanel;

		while (continua) {
			try {
				classe = Class.forName("view.problemas.P" + retClass(numClasse++));
				classe.newInstance();

				getPanel = classe.getMethod("getPanel");
				view.add((JPanel)getPanel.invoke(classe.newInstance()));
			} catch (Exception e) {
				continua = false;
			}
		}
	}

	private String retClass(int classe){
		String result = Integer.toString(classe);
		int qtdZero = 0;

		if (result.length() < 3){
			qtdZero = 3 - result.length();
			result = "";

			for (int i = 0; i < qtdZero; i++) {
				result += "0";
			}
			result += Integer.toString(classe);
		}

		return result;
	}

	public Integer getSizeView(){
		return view.size();
	}

	public JPanel getView(int index){
		return view.get(index);
	}

	public String getNameView(int index){
		return view.get(index).getName();
	}
}