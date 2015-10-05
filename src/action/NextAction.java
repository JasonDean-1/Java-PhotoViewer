package action;

import PhotoViewer.*;

public class NextAction implements Action
{

	@Override
	public void execute(ViewerService service, ViewerFrame frame)
	{
		service.next(frame);
	}

}
