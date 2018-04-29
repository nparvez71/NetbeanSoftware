/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goole;

/**
 *
 * @author J2EE-33
 */
public class OverloadigMethod {

public float average(int x1){
return x1;
}

public float average(int x1, int x2){
return x1+x2;
}

public float average(int x1,int x2,int x3){
return x1+x2+x3;
}

    public float  average(int...nums){
    int sum=0;
    for(int x :nums){
        sum+=x;
        
    }
    return ((float)sum)/nums.length;
    }

}
