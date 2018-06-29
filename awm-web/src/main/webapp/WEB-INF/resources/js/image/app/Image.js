function getUrlById(id) {
	Ext.define('image.model.ImageModel', {
				extend : 'Ext.data.Model',
				alias : 'widget.imageModel',
				fields : [{
							name : 'id',
							type : 'int'
						}, {
							name : 'image_id',
							type : 'int'
						}, {
							name : 'url',
							type : 'string'
						}, {
							name : 'height',
							type : 'int'
						}, {
							name : 'width',
							type : 'int'
						}, {
							name : 'coco_id',
							type : 'int'
						}, {
							name : 'flickr_id',
							type : 'int'
						}, {
							name : 'dateCreated',
							type : 'date',
							dateFormat : 'time'
						}, {
							name : 'dateModified',
							type : 'date',
							dateFormat : 'time'
						}]
			});
	var imageJsonDataGet = server_context + '/image/' + id + '.json';
	Ext.define('image.store.ImageStore', {
				extend : 'Ext.data.Store',
				alias : 'widget.imageStore',
				model : 'image.model.ImageModel',
				autoLoad : true,
				proxy : {
					type : 'ajax',
					url : imageJsonDataGet,
					reader : {
						type : 'json',
						successProperty : 'success'
					}
				}
			});
	var imageStore = Ext.create('image.store.ImageStore');
	imageStore.load({
						callback : function(records, operation, successful) {
							console.log(records[0]);
							url = records[0].get('url');
							$("#imgView").attr("src",url);
						}
					});
};
