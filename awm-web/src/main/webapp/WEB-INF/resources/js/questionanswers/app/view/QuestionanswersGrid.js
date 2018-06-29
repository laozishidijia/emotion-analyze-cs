var pageSize = 20;

var questionanswersStore = Ext.create('questionanswers.store.QuestionanswersStore');
questionanswersStore.load({
			callback : function(records, operation, successful) {
				if (successful) {
					console.log('department name:', records[0]);
				} else {
					console.log('the server reported an error');
				}
			}
		});
Ext.define('questionanswers.view.QuestionanswersGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.questionanswersGrid',
	title : 'questionanswers',
	store : questionanswersStore,
	columns : [ {
		text : 'ID',
		width : 80,//长度需要自行定义，ID太大
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "IMAGEID",
		width : 120,
		sortable : true,
		dataIndex : 'image_id'
	}, {
		text : "QAID",
		width : 120,
		sortable : true,
		dataIndex : 'qa_id'
	}, {
		text : "QUESTION",
		width : 120,
		sortable : true,
		dataIndex : 'question'
	}, {
		text : "ANSWER",
		width : 80,
		sortable : true,
		dataIndex : 'answer'
	},   {
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
		store : questionanswersStore,
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
