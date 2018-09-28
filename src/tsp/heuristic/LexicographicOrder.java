package tsp.heuristic;

import tsp.Instance;
import tsp.Solution;

public class LexicographicOrder extends AHeuristic{

	public LexicographicOrder(Instance instance, String name) throws Exception {
		super(instance, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve() throws Exception {
		// TODO Auto-generated method stub
		for(int k=0; k< m_instance.getNbCities(); k++){
			m_solution.setCityPosition(k, k);
		}
		m_solution.setCityPosition(0, m_instance.getNbCities());
	}

}
