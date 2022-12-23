
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;
import java.util.List;

/**
 *
 * @author Abdul Mukheed
 */
public class DepthFirst {
    public static boolean searchPath(int[][] maze,int x,int y,List<Integer> path){
        if(maze[x][y] == 9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[x][y] != 0) return false;
        
        if(maze[x][y] == 0){
            maze[x][y] = 2;
        }
        
        
        //downward call
        int dx = 1;
        int dy = 0;
        if(searchPath(maze,x+dx,y+dy,path)){
            path.add(x);
            path.add(y);
            return true;
        }
        //upward call
        dx = -1;
        dy = 0;
        if(searchPath(maze,x+dx,y,path)){
            path.add(x);
            path.add(y);
            return true;
        }
        //rightward call
        dx = 0;
        dy = 1;
        if(searchPath(maze,x,y+dy,path)){
            path.add(x);
            path.add(y);
            return true;
        }
        //leftward call
        dx = 0;
        dy = -1;
        if(searchPath(maze,x,y+dy,path)){
            path.add(x);
            path.add(y);
            return true;
        }
        return false;
    }

    
}