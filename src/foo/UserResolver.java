package foo;

import org.zkoss.xel.VariableResolver;
import org.zkoss.xel.XelException;

public class UserResolver implements VariableResolver {

	public Object resolveVariable(String name) throws XelException {
		return "users".equals(name) ? Users.getAll() : null;
	}

}
