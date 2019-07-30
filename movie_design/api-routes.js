let router = require('express').Router();
let MoviesController = require('./moviesController');

router.get('/',(req,res)=>{
    res.json({
        status:'API is working',
        message:'Movie apps rest API'
    })
})

router.route('/movies').get(MoviesController.viewAll).post(MoviesController.create);

router.route('/movies/:id').get(MoviesController.view);
router.route('/movies/:id').put(MoviesController.update).delete(MoviesController.delete);
module.exports = router;