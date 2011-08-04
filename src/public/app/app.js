//Register the Main Application
Ext.regApplication({
    name: 'LPG'
    launch: function () {
        this.views.viewport = new this.views.Viewport();
    }
});
