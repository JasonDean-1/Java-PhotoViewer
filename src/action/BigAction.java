package action;

import PhotoViewer.*;

public class BigAction implements Action
{

	@Override
	public void execute(ViewerService service, ViewerFrame frame)
	{
		service.zoom(frame, true);
	}

}
