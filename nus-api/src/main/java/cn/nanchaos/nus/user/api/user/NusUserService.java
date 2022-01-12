package cn.nanchaos.nus.user.api.user;

import cn.nanchaos.nus.response.Result;
import cn.nanchaos.nus.user.reqdto.NusUserSaveReqDTO;
import cn.nanchaos.nus.user.reqdto.NusUserSelectReqDTO;
import cn.nanchaos.nus.user.reqdto.NusUserUpdateReqDTO;
import cn.nanchaos.nus.user.resdto.NusUserSaveResDTO;
import cn.nanchaos.nus.user.resdto.NusUserSelectResDTO;
import cn.nanchaos.nus.user.resdto.NusUserUpdateResDTO;

/**
 * Default Description
 *
 * @author: nanchaos
 * @time: 2022/1/12
 */
public interface NusUserService {
    /**
     * 新增用户
     *
     * @param nusUserSaveReqDTO
     * @return
     */
    Result<NusUserSaveResDTO> saveNusUser(NusUserSaveReqDTO nusUserSaveReqDTO);

    /**
     * 更新用户
     *
     * @param nusUserReqDTO
     * @return
     */
    Result<NusUserUpdateResDTO> updateNusUserByNusUserId(NusUserUpdateReqDTO nusUserReqDTO);

    /**
     * 根据id筛选
     *
     * @param nusUserSelectReqDTO
     * @return
     */
    Result<NusUserSelectResDTO> selectNusUserById(NusUserSelectReqDTO nusUserSelectReqDTO);
}
