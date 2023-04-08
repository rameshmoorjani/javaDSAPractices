import java.util.Stack;

public class AsteriodsProblem {

    public static void main(String[] args) {

        asteroidCollision(new int[]{5,-10,-15});

    }

        public static int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack();

            for(int i=0;i<asteroids.length;i++)
            {
                if(!stack.isEmpty())
                {
                    if(stack.peek()<0)
                    {
                        stack.push(asteroids[i]);
                    }
                    else
                    {

                        if(asteroids[i]>0)
                        {
                            stack.push(asteroids[i]);
                        }
                        else if(asteroids[i]<0)
                        {
                            /*if(stack.peek()-Math.abs(asteroids[i])>0)
                            {

                            }
                            else {
                                stack.pop();
                                stack.push(asteroids[i]);
                            }*/
                            int peak =stack.peek();
                            //stack.push(asteroids[i]);
                            while(!stack.isEmpty() && peak>=0)
                            {
                                if(Math.abs(asteroids[i])>=peak) {
                                    stack.pop();
                                    if(!stack.isEmpty()) {
                                        peak = stack.peek();
                                    }
                                    else
                                    {
                                        if(Math.abs(asteroids[i])>peak)
                                        {
                                            stack.push(asteroids[i]);
                                            peak=-1;
                                        }

                                        /*if(Math.abs(asteroids[i])==peak)
                                        {
                                            stack.pop();
                                        }
                                        else {
                                            stack.push(asteroids[i]);
                                            peak = -1;
                                        }*/
                                    }
                                    //stack.push(asteroids[i]);
                                }
                                else {
                                    peak=-1;
       //                             stack.pop();
                                }
                            }


                        }

                        /*int lastval = stack.peek();
                        if(lastval>0 && asteroids[i]>0)
                        {
                            stack.push(asteroids[i]);
                        }
                        else if( lastval<0 && asteroids[i]>0)
                        {
                            stack.push(asteroids[i]);
                        }
                        else {
                            int result = lastval - asteroids[i];
                            if (result == 0) {
                                stack.remove(stack.peek());
                            } else {
                                stack.push(asteroids[i]);
                            }
                        }*/

                    }
                }
                else {
                    stack.push(asteroids[i]);
                }

            }
            System.out.println(stack);
            return null;
        }
}
