package cn.nanchaos.nus.api.user.impl;

import cn.nanchaos.nus.biz.user.NusUserServiceHandler;
import cn.nanchaos.nus.response.Result;
import cn.nanchaos.nus.user.api.user.NusUserService;
import cn.nanchaos.nus.user.reqdto.NusUserSaveReqDTO;
import cn.nanchaos.nus.user.reqdto.NusUserSelectReqDTO;
import cn.nanchaos.nus.user.reqdto.NusUserUpdateReqDTO;
import cn.nanchaos.nus.user.resdto.NusUserSaveResDTO;
import cn.nanchaos.nus.user.resdto.NusUserSelectResDTO;
import cn.nanchaos.nus.user.resdto.NusUserUpdateResDTO;

import javax.annotation.Resource;

/**
 * Default Description
 *
 * @author: nanchaos
 * @time: 2022/1/12
 */
public class NusUserServiceImpl implements NusUserService {
    @Resource
    private NusUserServiceHandler nusUserServiceHandler;

    /**
     * 新增用户
     *
     * @param nusUserSaveReqDTO
     * @return
     */
    @Override
    public Result<NusUserSaveResDTO> saveNusUser(NusUserSaveReqDTO nusUserSaveReqDTO) {
        Boolean res = nusUserServiceHandler.saveNusUser(nusUserSaveReqDTO);

        return null;
    }

    /**
     * 更新用户
     *
     * @param nusUserReqDTO
     * @return
     */
    @Override
    public Result<NusUserUpdateResDTO> updateNusUserByNusUserId(NusUserUpdateReqDTO nusUserReqDTO) {
        return null;
    }

    /**
     * 根据id筛选
     *
     * @param nusUserSelectReqDTO
     * @return
     */
    @Override
    public Result<NusUserSelectResDTO> selectNusUserById(NusUserSelectReqDTO nusUserSelectReqDTO) {
        return null;
    }
}
