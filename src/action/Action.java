package action;

import PhotoViewer.*;

public interface Action
{
	/**
	 * ����ִ�еķ���
	 * 
	 * @param service
	 *            ͼƬ�������ҵ������
	 * @param frame
	 *            ���������
	 */
	void execute(ViewerService service, ViewerFrame frame);
}
