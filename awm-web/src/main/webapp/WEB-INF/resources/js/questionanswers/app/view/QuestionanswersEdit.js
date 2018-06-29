Ext.define('questionanswers.view.QuestionanswersEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.questionanswersEdit',
	title : '编辑问答信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [{
				xtype : 'textfield',
				name : 'image_id',
				fieldLabel : 'IMAGEID'
			}, {
				xtype : 'textfield',
				name : 'qa_id',
				fieldLabel : 'QAID'
			}, {
				xtype : 'textfield',
				name : 'question',
				fieldLabel : 'QUESTION'
			},{
				xtype : 'textfield',
				name : 'answer',
				fieldLabel : 'ANSWER'
			}]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
