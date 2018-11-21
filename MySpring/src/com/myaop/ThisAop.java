package com.myaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ThisAop implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return null;
	}
	/*Object obj;
	
	public Object bind(Object o){
		obj = o;
		return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {
			result = method.invoke(obj, null);
		} catch (Exception e) {
			
		}finally {
			
		}
		System.out.println("this's feet");
		return result;
	}*/

}
