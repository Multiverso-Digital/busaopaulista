package com.abreuretto.busaopaulista;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.abreuretto.busaopaulista.R;


public class MyFragment extends Fragment 

{  
	@Override  public View onCreateView(LayoutInflater inflater, ViewGroup container,    
			Bundle savedInstanceState) 
	{   // TODO Auto-generated method stub   
		View myFragmentView = inflater.inflate(R.layout.mapafragment , container, false);     
		return myFragmentView;  
		
	}
	

}

