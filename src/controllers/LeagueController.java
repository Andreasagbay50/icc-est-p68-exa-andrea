package controllers;

import models.League;

public class LeagueController {
    public League[] sortSelectionAsc(League[] leagues) {
        int n = leagues.length;
        for(int i=0 ; i < n ; i ++){
            int nunmenor = i ;
            for( int j = 0 ; j < n ; j ++){
                if (leagues[j].getTotalActiveGoals()<leagues[nunmenor].getTotalActiveGoals()){
                    nunmenor = j ;
                }
            }
            League m = leagues[i];
            leagues[i] = leagues[nunmenor];
            leagues[nunmenor] = m ; 

        }
        return leagues;

    }
    public League[] binarySearchByTotalActiveGoals(League[] leagues) {
        sortSelectionAsc(leagues);
        int bajo = 0 ;
        int alto = leagues.length -1 ; 
        while (bajo <= alto ){
            int centro = (bajo + alto ) /2;
            int valorcentro = leagues(centro).getGoals();
            if(valorcentro == )


        }
        
        

        
        
    
    }
    }

