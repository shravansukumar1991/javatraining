package demo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PremierLeague {
	int Position;
	String Club;
	int MP;
	int W;
	int D;
	int L;
	int GF;
	int GA;
	int GD;
	int Pts;
	
	PremierLeague(){
		 Club="";
		 Position=0;
		 MP=0;
		 W=0;
		 D=0;
		 L=0;
		 GF=0;
		 GA=0;
		 GD=0;
		 Pts=0;
	}
	public void setDetails (int pos,String name, int MP, int W,int D,int L,int GF,int GA,int GD,int pts) {
	    this.Position = pos;
		this.Club = name;
	    this.MP = MP;
	    this.W = W;
	    this.D = D;
	    this.L = L;
	    this.GF = GF;
	    this.GA = GA;
	    this.GD = GD;
	    this.Pts = pts;
	}

	public void printPLDetails() {
		System.out.println (this.Position+","+ this.Club+","+ this.MP + "," + this.W + "," + this.D + "," + this.L + "," + this.GF +"," + this.GA + "," + this.GD + "," + this.Pts);
	}
 }

