var pageSize = 20;

var imageStore = Ext.create('image.store.ImageStore');
imageStore.load({
			callback : function(records, operation, successful) {
			console.log(records[0]);
			}
		});
Ext.define('image.view.ImageGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.imageGrid',
	title : '班级课程表',
	store : imageStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	},{
		text : 'IMAGE_ID',
		width : 50,
		sortable : true,
		dataIndex : 'image_id'
	}, {
		text : "URL",
		width : 80,
		sortable : true,
		dataIndex : 'url'
	}, {
		text : "HEIGHT",
		width : 120,
		sortable : true,
		dataIndex : 'height'
	}, {
		text : "WIDTH",
		width : 80,
		sortable : true,
		dataIndex : 'width'
	}, {
		text : "COCO_ID",
		width : 80,
		sortable : true,
		dataIndex : 'coco_id'
	},  {
		text : "FLICKR_ID",
		width : 80,
		sortable : true,
		dataIndex : 'flickr_id'
	},  {
		text : "添加时间",
		width : 150,
		dataIndex : 'dateCreated',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	}, {
		text : "修改时间",
		width : 150,
		dataIndex : 'dateModified',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : imageStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});
