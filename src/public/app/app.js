//Register the Main Application
Ext.regApplication({
    name: "LPG",
    launch: function() {
        this.views.viewport = new LPG.views.Viewport();
    }
})
